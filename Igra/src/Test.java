import org.apache.commons.lang3.ArrayUtils;

public class Test {

	public static void main(String[] args) {
		// building the battleBoard
		MonsterTwo.buildBattleBoard();

		// Creating array of objects(monsters)
		MonsterTwo[] Monsters = new MonsterTwo[4];
		// Creating the Monsters
		Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
		Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
		Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul");
		Monsters[3] = new MonsterTwo(1000, 20, 1, "George");
		// readrawing the battleBoard
		MonsterTwo.redrawBoard();

		for (MonsterTwo m : Monsters) {
			// check with calling the method getAlive()
			if (m.getAlive()) {

				int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				// moving the monsters
				m.moveMonster(Monsters, arrayItemIndex);
			}
		}
		// and againg redrawing the BattleBoard to show the final positions of
		// the monsters
		MonsterTwo.redrawBoard();

	}
}
