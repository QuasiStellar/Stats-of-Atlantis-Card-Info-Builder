package heroes

import Action
import Card
import Color
import Item
import Modifier

val ursafar = setOf(
    Card(
        "Claws That Catch",
        """
            Before the attack: If you are enraged and
            not adjacent to an enemy unit, move up to
            1 space. Target a unit adjacent to you. After
            the attack: **This round:** You are enraged.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Jaws That Bite",
        """
            Before the attack: If enraged, you may
            move 1 space to a space adjacent to an
            enemy hero. Target a hero adjacent to you.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Angry Roar",
        """
            Push adjacent enemy minions up
            to 1 space. If enraged, you may
            retrieve a resolved attack card.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.SILVER,
        initiative = 11,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 3,
    ),
    Card(
        "Unbound Fury",
        """
            You are always enraged. While an active
            effect on another card is also making you
            enraged, gain +2 ::movement_silver:: Movement.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Prowling Brute",
        """
            If enraged, you may swap with an adjacent
            minion after you perform this action.
            ~(You may choose to move 0 spaces and still swap).
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 5,
    ),
    Card(
        "Prey Drive",
        """
            Target a unit adjacent to you. Before the
            attack: If you are enraged and target a hero,
            you may remove an enemy minion in radius.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
    ),
    Card(
        "Sniff Out",
        """
            If not enraged, **This round:** You are enraged;
            otherwise, an enemy hero in range, not
            adjacent to you, or to another unit,
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Rampaging Beast",
        """
            If enraged, you may swap with an adjacent
            unit, or a token, after you perform this action.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Prey Abundance",
        """
            Target a unit adjacent to you. Before the
            attack: If you are enraged and target a hero,
            you may remove an enemy minion in radius.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Eyes on the Prey",
        """
            If not enraged, **This round:** You are enraged;
            otherwise, an enemy hero in range, not
            adjacent to you, or to another unit,
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Hulking Menace",
        """
            **This round:** While enraged, enemy units
            cannot move through spaces adjacent to you.
            ~(They can move into, or out of those spaces, but not both).
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Rip",
        """
            After the attack: If you are enraged, and
            the target is defeated, gain 1 extra coin.
            **This round:** you are enraged.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Instinctive Reaction",
        """
            If not enraged, **This round:** You are enraged;
            otherwise, **choose one —**
            >>Perform an action on your discarded card.
            >>You may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Unstoppable Force",
        """
            If enraged, you may swap with an
            adjacent unit, or a token, before
            or after you perform this action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Feeding Frenzy",
        """
            Target a unit adjacent to you. Before the
            attack: If you are enraged and target a hero,
            you may remove an enemy minion in radius.
            **This round:** You are enraged.
            May repeat once on a different target hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Apex Predator",
        """
            If not enraged, **This round:** You are enraged;
            otherwise, an enemy hero in range, not
            adjacent to you, or to another unit,
            discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Immovable Object",
        """
            **This round:** While enraged, enemy units
            cannot move through spaces adjacent to you.
            You cannot be made to leave your space by
            enemy heroes. Ignore any effects that limit,
            reduce, or prevent movement.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Tear",
        """
            After the attack: If you are enraged, and
            the target is defeated, gain 3 extra coins; If you
            defeat a hero, that hero spends 1 extra ::life_counters::
            Life counter. **This round:** you are enraged.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Evolutionary Response",
        """
            If not enraged, **This round:** You are enraged;
            otherwise, **choose one, or both —**
            >>Perform an action on your discarded card.
            >>You may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
)
