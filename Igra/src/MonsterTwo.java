import java.util.Arrays;

public class MonsterTwo {
	// twodimentional array 10x10
	static char[][] battleBoard = new char[10][10];

	// method that will populate the battleboard
	public static void buildBattleBoard() {
		// for each
		for (char[] row : battleBoard) {
			// calling the method fill from class Array to fill the rows with *
			Arrays.fill(row, '*');
		}
	}

	// method that will redraw the battleBoard
	public static void redrawBoard() {

		int k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();

		// loop the draw the insides of the battleBoard
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {

				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
	}

	public final String Tombstone = "Here lies a Dead Monster!"; //
	private int health = 500;
	private int attack = 20;
	private int movement = 2;

	private boolean alive = true;

	public String name = "Big Monster";
	public char nameChar1 = 'B'; // Big Monster :)
	public int xPosition = 0;
	public int yPosition = 0;

	public static int numOfMonsters = 0;

	// Accesor methods
	public int getAttack() {
		return attack;
	}

	public int getMovement() {
		return movement;
	}

	public int getHealth() {
		return health;
	}

	// is the monster alive
	public boolean getAlive() {
		return alive;
	}

	// method to set and check is the monster been atacked
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		// is the monster dead
		if (health < 0) {

			alive = false;
		}
	}

	// Overload of setHealth
	public void setHealth(double decreaseHealth) {

		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		// is the monster dead
		if (health < 0) {

			alive = false;
		}
	}

	// method that will move the monster
	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
		// to check if the element is okay to move
		boolean isSpaceOpen = true;
		// stores the rows of the array -1
		int maxXBoardSpace = battleBoard.length - 1;
		// stores the collums of the array -1
		int maxYBoardSpace = battleBoard[0].length - 1;

		while (isSpaceOpen) {
			// to store random movement
			int randMoveDirection = (int) (Math.random() * 4);
			// to stre random distance
			int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));

			System.out.println(randMoveDistance + " " + randMoveDirection);
			// filling
			battleBoard[this.yPosition][this.xPosition] = '*';

			if (randMoveDirection == 0) {

				if ((this.yPosition - randMoveDistance) < 0) {
					// stayed there
					this.yPosition = 0;
				} else {
					// moved to other position
					this.yPosition = this.yPosition - randMoveDistance;
				}

			} else if (randMoveDirection == 1) {
				if ((this.xPosition + randMoveDistance) > maxXBoardSpace) {
					// going to boardSpace
					this.xPosition = maxXBoardSpace;
				} else {
					// or going here
					this.xPosition = xPosition + randMoveDistance;
				}
			} else if (randMoveDirection == 2) {
				if ((this.yPosition + randMoveDistance) > maxYBoardSpace) {

					this.yPosition = maxYBoardSpace;
				} else {
					this.yPosition = yPosition + randMoveDistance;
				}
			} else {
				if ((this.xPosition - randMoveDistance) < 0) {

					this.xPosition = 0;
				} else {
					this.xPosition = xPosition - randMoveDistance;
				}

				for (int i = 0; i < monster.length; i++) {

					if (i == arrayItemIndex) {

						continue;
					}
					// checking if the sapce is open to move or not
					if (onMySpace(monster, i, arrayItemIndex)) {

						isSpaceOpen = true;
						break;
					} else {

						isSpaceOpen = false;
					}

				}

			}
		}
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
	}

	public boolean onMySpace(MonsterTwo[] monster, int indexToChk1,
			int indexToChk2) {

		if ((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition)
				&& (monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) {

			return true;

		} else {

			return false;
		}

	}

	// Constructor
	public MonsterTwo(int Health, int Attack, int Movement, String name) {

		this.health = Health;
		this.attack = Attack;
		this.movement = Movement;
		this.name = name;

		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;

		int randNumX, randNumY;

		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while (battleBoard[randNumX][randNumY] != '*');

		this.xPosition = randNumX;
		this.yPosition = randNumY;

		this.nameChar1 = this.name.charAt(0);

		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

		numOfMonsters++;

	}

	// Default CONSTRUCTOR to increment the number of monsters
	public MonsterTwo() {

		numOfMonsters++;

	}

}
