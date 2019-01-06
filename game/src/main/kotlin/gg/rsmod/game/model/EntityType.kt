package gg.rsmod.game.model

/**
 * @author Tom <rspsmods@gmail.com>
 */
enum class EntityType {

    /**
     * A player in our world, which does not necessarily need to be controlled
     * by a human.
     */
    PLAYER,

    /**
     * A human-controlled [PLAYER].
     */
    CLIENT,

    /**
     * A non-playable character.
     */
    NPC,

    /**
     * A game object that is part of the static terrain (loaded from game resources).
     */
    STATIC_OBJECT,

    /**
     * A game object that is spawned in by the [gg.rsmod.game.model.World].
     */
    DYNAMIC_OBJECT,

    /**
     * A projectile.
     */
    PROJECTILE;

    fun isHumanControlled(): Boolean = this == CLIENT

    fun isPlayer(): Boolean = this == CLIENT || this == PLAYER

    fun isNpc(): Boolean = this == NPC

    fun isObject(): Boolean = this == STATIC_OBJECT || this == DYNAMIC_OBJECT

    fun isProjectile(): Boolean = this == PROJECTILE

    /**
     * Checks if the entity type should not be added to a region as an entity
     * that should be spawned in for players who just enter its region.
     */
    fun isTransient(): Boolean = this == PROJECTILE
}