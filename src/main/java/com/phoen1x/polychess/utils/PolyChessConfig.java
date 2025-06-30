package com.phoen1x.polychess.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Клас конфігурації для моду PolyChess.
 * Керує налаштуваннями, такими як увімкнення/вимкнення генерації луту в структурах.
 * Конфігурація зберігається у файлі 'polychess.json' у папці config Minecraft.
 */
public class PolyChessConfig {

    // Gson об'єкт для серіалізації/десеріалізації JSON з гарним форматуванням.
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    // Шлях до конфігураційного файлу: <minecraft_config_dir>/polychess.json
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("polychess.json");
    // Єдиний екземпляр класу конфігурації (синглтон).
    private static PolyChessConfig INSTANCE;

    /**
     * Чи увімкнена генерація луту з шаховими фігурами у структурах.
     * За замовчуванням: false (вимкнено).
     */
    public boolean enableStructureLootGeneration = false; 

    /**
     * Приватний конструктор для забезпечення патерну синглтон.
     */
    private PolyChessConfig() {
        // Приватний конструктор
    }

    /**
     * Повертає єдиний екземпляр PolyChessConfig.
     * Якщо екземпляр ще не створено, він завантажується з файлу або створюється з налаштуваннями за замовчуванням.
     *
     * @return Єдиний екземпляр PolyChessConfig.
     */
    public static PolyChessConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = load();
        }
        return INSTANCE;
    }

    /**
     * Завантажує конфігурацію з файлу.
     * Якщо файл існує, він читається та десеріалізується.
     * Якщо файл не існує або виникає помилка при завантаженні, створюється та зберігається конфігурація за замовчуванням.
     *
     * @return Завантажений екземпляр PolyChessConfig або новий з налаштуваннями за замовчуванням.
     */
    private static PolyChessConfig load() {
        File configFile = CONFIG_PATH.toFile();
        if (configFile.exists()) {
            try (FileReader reader = new FileReader(configFile)) {
                // Десеріалізуємо JSON у об'єкт PolyChessConfig.
                return GSON.fromJson(reader, PolyChessConfig.class);
            } catch (IOException e) {
                // Виводимо помилку, якщо завантаження не вдалося, і повертаємо конфігурацію за замовчуванням.
                System.err.println("PolyChess: Failed to load config from " + CONFIG_PATH + ", using default: " + e.getMessage());
                return new PolyChessConfig(); 
            }
        } else {
            // Якщо файл не існує, створюємо конфігурацію за замовчуванням і зберігаємо її.
            PolyChessConfig defaultConfig = new PolyChessConfig();
            defaultConfig.save(); 
            System.out.println("PolyChess: Created default config file at " + CONFIG_PATH);
            return defaultConfig;
        }
    }

    /**
     * Зберігає поточний стан конфігурації у файл.
     * Якщо батьківські каталоги не існують, вони створюються.
     */
    public void save() {
        File configFile = CONFIG_PATH.toFile();
        try {
            // Переконуємося, що батьківські каталоги існують.
            configFile.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(configFile)) {
                // Серіалізуємо поточний об'єкт PolyChessConfig у JSON і записуємо у файл.
                GSON.toJson(this, writer);
            }
        } catch (IOException e) {
            // Виводимо помилку, якщо збереження не вдалося.
            System.err.println("PolyChess: Failed to save config to " + CONFIG_PATH + ": " + e.getMessage());
        }
    }
}
