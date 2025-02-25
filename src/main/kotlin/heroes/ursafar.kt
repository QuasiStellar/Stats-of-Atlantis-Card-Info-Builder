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
            Before the attack: If enraged, you may
            move 1 space to a space adjacent to an
            enemy hero. Target a unit adjacent to you.
            **This round:** You are enraged.
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
            If enraged, perform the primary action on one
            of your active cards with an active effect.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.SILVER,
        initiative = 7,
        primaryAction = Action.SKILL,
        secondaryDefense = 4,
    ),
    Card(
        "Unbound Fury",
        """
            You are always enraged, and all your
            resolved cards count as active.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Prowling Brute",
        """
            If enraged, after movement, you may swap
            with a unit or token adjacent to you.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 1,
        secondaryDefense = 5,
    ),
    Card(
        "Prey Drive",
        """
            Target a unit adjacent to you. After the attack:
            If enraged, and the target weas not removed,
            remove up to 1 enemy minion in radius.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Sniff Out",
        """
            If enraged, an enemy hero in range
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Rampaging Beast",
        """
            If enraged, after movement, you may swap
            with a unit or token adjacent to you;
            if you do, move up to 1 additional space.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 1,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Prey Abundance",
        """
            Target a unit adjacent to you. After the attack:
            If enraged, and the target was not removed,
            remove up to 1 enemy minion in radius.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Eyes on the Prey",
        """
            If enraged, an enemy hero in range
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Cold Ire",
        """
            If enraged, gain +1 ::movement_blue:: Movement.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Rip",
        """
            Target a unit adjacent to you.
            After the attack: If enraged, gain 1 coin.
            **This round:** you are enraged.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Instinctive Reaction",
        """
            If enraged, **choose one —**
            >>Perform the primary action on one
            >of your discarded cards.
            >>You may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Unstoppable Force",
        """
            If enraged, after movement, you may swap
            with a unit or token adjacent to you;
            if you do, move up to 2 additional spaces.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 1,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Feeding Frenzy",
        """
            Target a unit adjacent to you. After the attack:
            If enraged, and the target was not removed,
            remove up to 2 enemy minions in radius.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.DEFENSE,
    ),
    Card(
        "Apex Predator",
        """
            If enraged, an enemy hero in range
            discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Eyes of Flame",
        """
            If enraged, gain +2 ::movement_blue:: Movement.
            **This round:** You are enraged.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "Tear",
        """
            Target a unit adjacent to you.
            After the attack: If enraged, gain 2 coins.;
            if you defeated a hero, that hero spends
            1 additional ::life_counters:: Life counter.
            **This round:** you are enraged.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Evolutionary Response",
        """
            If enraged, **choose one, or both —**
            >> Perform the primary action on one
            >of your discarded cards.
            >> You may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.MOVEMENT,
    ),
)
