package net.minestom.server.entity;

import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

/**
 * //==============================
 * //  AUTOGENERATED BY EnumGenerator
 * //==============================
 */
@SuppressWarnings({"deprecation"})
public enum EntityType {
    AREA_EFFECT_CLOUD("minecraft:area_effect_cloud", 6.0, 0.5),

    ARMOR_STAND("minecraft:armor_stand", 0.5, 1.975),

    ARROW("minecraft:arrow", 0.5, 0.5),

    BAT("minecraft:bat", 0.5, 0.9),

    BEE("minecraft:bee", 0.7, 0.6),

    BLAZE("minecraft:blaze", 0.6, 1.8),

    BOAT("minecraft:boat", 1.375, 0.5625),

    CAT("minecraft:cat", 0.6, 0.7),

    CAVE_SPIDER("minecraft:cave_spider", 0.7, 0.5),

    CHICKEN("minecraft:chicken", 0.4, 0.7),

    COD("minecraft:cod", 0.5, 0.3),

    COW("minecraft:cow", 0.9, 1.4),

    CREEPER("minecraft:creeper", 0.6, 1.7),

    DOLPHIN("minecraft:dolphin", 0.9, 0.6),

    DONKEY("minecraft:donkey", 1.39648, 1.5),

    DRAGON_FIREBALL("minecraft:dragon_fireball", 1.0, 1.0),

    DROWNED("minecraft:drowned", 0.6, 1.95),

    ELDER_GUARDIAN("minecraft:elder_guardian", 1.9975, 1.9975),

    END_CRYSTAL("minecraft:end_crystal", 2.0, 2.0),

    ENDER_DRAGON("minecraft:ender_dragon", 16.0, 8.0),

    ENDERMAN("minecraft:enderman", 0.6, 2.9),

    ENDERMITE("minecraft:endermite", 0.4, 0.3),

    EVOKER("minecraft:evoker", 0.6, 1.95),

    EVOKER_FANGS("minecraft:evoker_fangs", 0.5, 0.8),

    EXPERIENCE_ORB("minecraft:experience_orb", 0.5, 0.5),

    EYE_OF_ENDER("minecraft:eye_of_ender", 0.25, 0.25),

    FALLING_BLOCK("minecraft:falling_block", 0.98, 0.98),

    FIREWORK_ROCKET("minecraft:firework_rocket", 0.25, 0.25),

    FOX("minecraft:fox", 0.6, 0.7),

    GHAST("minecraft:ghast", 4.0, 4.0),

    GIANT("minecraft:giant", 3.6, 12.0),

    GUARDIAN("minecraft:guardian", 0.85, 0.85),

    HOGLIN("minecraft:hoglin", 1.39648, 1.4),

    HORSE("minecraft:horse", 1.39648, 1.6),

    HUSK("minecraft:husk", 0.6, 1.95),

    ILLUSIONER("minecraft:illusioner", 0.6, 1.95),

    IRON_GOLEM("minecraft:iron_golem", 1.4, 2.7),

    ITEM("minecraft:item", 0.25, 0.25),

    ITEM_FRAME("minecraft:item_frame", 0.5, 0.5),

    FIREBALL("minecraft:fireball", 1.0, 1.0),

    LEASH_KNOT("minecraft:leash_knot", 0.5, 0.5),

    LIGHTNING_BOLT("minecraft:lightning_bolt", 0.0, 0.0),

    LLAMA("minecraft:llama", 0.9, 1.87),

    LLAMA_SPIT("minecraft:llama_spit", 0.25, 0.25),

    MAGMA_CUBE("minecraft:magma_cube", 2.04, 2.04),

    MINECART("minecraft:minecart", 0.98, 0.7),

    CHEST_MINECART("minecraft:chest_minecart", 0.98, 0.7),

    COMMAND_BLOCK_MINECART("minecraft:command_block_minecart", 0.98, 0.7),

    FURNACE_MINECART("minecraft:furnace_minecart", 0.98, 0.7),

    HOPPER_MINECART("minecraft:hopper_minecart", 0.98, 0.7),

    SPAWNER_MINECART("minecraft:spawner_minecart", 0.98, 0.7),

    TNT_MINECART("minecraft:tnt_minecart", 0.98, 0.7),

    MULE("minecraft:mule", 1.39648, 1.6),

    MOOSHROOM("minecraft:mooshroom", 0.9, 1.4),

    OCELOT("minecraft:ocelot", 0.6, 0.7),

    PAINTING("minecraft:painting", 0.5, 0.5),

    PANDA("minecraft:panda", 1.3, 1.25),

    PARROT("minecraft:parrot", 0.5, 0.9),

    PHANTOM("minecraft:phantom", 0.9, 0.5),

    PIG("minecraft:pig", 0.9, 0.9),

    PIGLIN("minecraft:piglin", 0.6, 1.95),

    PIGLIN_BRUTE("minecraft:piglin_brute", 0.6, 1.95),

    PILLAGER("minecraft:pillager", 0.6, 1.95),

    POLAR_BEAR("minecraft:polar_bear", 1.4, 1.4),

    TNT("minecraft:tnt", 0.98, 0.98),

    PUFFERFISH("minecraft:pufferfish", 0.7, 0.7),

    RABBIT("minecraft:rabbit", 0.4, 0.5),

    RAVAGER("minecraft:ravager", 1.95, 2.2),

    SALMON("minecraft:salmon", 0.7, 0.4),

    SHEEP("minecraft:sheep", 0.9, 1.3),

    SHULKER("minecraft:shulker", 1.0, 1.0),

    SHULKER_BULLET("minecraft:shulker_bullet", 0.3125, 0.3125),

    SILVERFISH("minecraft:silverfish", 0.4, 0.3),

    SKELETON("minecraft:skeleton", 0.6, 1.99),

    SKELETON_HORSE("minecraft:skeleton_horse", 1.39648, 1.6),

    SLIME("minecraft:slime", 2.04, 2.04),

    SMALL_FIREBALL("minecraft:small_fireball", 0.3125, 0.3125),

    SNOW_GOLEM("minecraft:snow_golem", 0.7, 1.9),

    SNOWBALL("minecraft:snowball", 0.25, 0.25),

    SPECTRAL_ARROW("minecraft:spectral_arrow", 0.5, 0.5),

    SPIDER("minecraft:spider", 1.4, 0.9),

    SQUID("minecraft:squid", 0.8, 0.8),

    STRAY("minecraft:stray", 0.6, 1.99),

    STRIDER("minecraft:strider", 0.9, 1.7),

    EGG("minecraft:egg", 0.25, 0.25),

    ENDER_PEARL("minecraft:ender_pearl", 0.25, 0.25),

    EXPERIENCE_BOTTLE("minecraft:experience_bottle", 0.25, 0.25),

    POTION("minecraft:potion", 0.25, 0.25),

    TRIDENT("minecraft:trident", 0.5, 0.5),

    TRADER_LLAMA("minecraft:trader_llama", 0.9, 1.87),

    TROPICAL_FISH("minecraft:tropical_fish", 0.5, 0.4),

    TURTLE("minecraft:turtle", 1.2, 0.4),

    VEX("minecraft:vex", 0.4, 0.8),

    VILLAGER("minecraft:villager", 0.6, 1.95),

    VINDICATOR("minecraft:vindicator", 0.6, 1.95),

    WANDERING_TRADER("minecraft:wandering_trader", 0.6, 1.95),

    WITCH("minecraft:witch", 0.6, 1.95),

    WITHER("minecraft:wither", 0.9, 3.5),

    WITHER_SKELETON("minecraft:wither_skeleton", 0.7, 2.4),

    WITHER_SKULL("minecraft:wither_skull", 0.3125, 0.3125),

    WOLF("minecraft:wolf", 0.6, 0.85),

    ZOGLIN("minecraft:zoglin", 1.39648, 1.4),

    ZOMBIE("minecraft:zombie", 0.6, 1.95),

    ZOMBIE_HORSE("minecraft:zombie_horse", 1.39648, 1.6),

    ZOMBIE_VILLAGER("minecraft:zombie_villager", 0.6, 1.95),

    ZOMBIFIED_PIGLIN("minecraft:zombified_piglin", 0.6, 1.95),

    PLAYER("minecraft:player", 0.6, 1.8),

    FISHING_BOBBER("minecraft:fishing_bobber", 0.25, 0.25);

    @NotNull
    private String namespaceID;

    private double width;

    private double height;

    EntityType(@NotNull String namespaceID, double width, double height) {
        this.namespaceID = namespaceID;
        this.width = width;
        this.height = height;
        Registries.entityTypes.put(NamespaceID.from(namespaceID), this);
    }

    public short getId() {
        return (short)ordinal();
    }

    public String getNamespaceID() {
        return namespaceID;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public static EntityType fromId(short id) {
        if(id >= 0 && id < values().length) {
            return values()[id];
        }
        return PIG;
    }
}
