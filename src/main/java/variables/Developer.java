package variables;

public class Developer {

	private static final String businessRef = "EVERIS";
	private static final int NUMMAXEMPLOYEES = 127;
	private int idEmployees;
	private static int countIdEmployees = 1;
	private String name;
	private static final int NUMMAXHOLYDAIS = 21;
	private int numHolidays;
	private int countNumHolidays;

	public Developer(String name) {
		this.name = name;
		idEmployees = countIdEmployees++;
		numHolidays = NUMMAXHOLYDAIS;
	}

	/**
	 * @return the idEmployees
	 */
	public int getIdEmployees() {
		return idEmployees;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the businessref
	 */
	public static String getBusinessref() {
		return businessRef;
	}

	/**
	 * @return the nummaxemployees
	 */
	public static int getNummaxemployees() {
		return NUMMAXEMPLOYEES;
	}

	/**
	 * @return the nummaxemployees
	 */
	public static int getNummaxholydays() {
		return NUMMAXHOLYDAIS;
	}

	/**
	 * @return the numHolidays
	 */
	public int getNumHolidays() {
		return numHolidays;
	}

	/**
	 * @param numHolidays
	 *            the numHolidays to set
	 */
	public void discountHolidays(int countDays) {
		if (countDays <= NUMMAXHOLYDAIS)
			if (this.numHolidays > 0 && countDays <= numHolidays) {
				countNumHolidays = numHolidays - countDays;
				this.numHolidays = countNumHolidays;
			} else {
				System.out.println("You can discount more days than you have");
			}

	}

}
