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

	/**
	 * Builder with employee id and vacation number
	 * 
	 * @param name
	 */
	public Developer(String name) {
		this.name = name;
		// every time an employee is created, his id is added to one
		idEmployees = countIdEmployees++;
		// assign vacation days
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
	 *            discount days
	 */
	public void discountHolidays(int countDays) {
		// if the data entered is less than or equal to the maximum vacation days
		if (countDays <= NUMMAXHOLYDAIS)
			// if the number of vacations is greater than zero and the days entered are less than or equal to the vacation days
			if (this.numHolidays > 0 && countDays <= numHolidays) {
				// the days of vacation are subtracted minus the days entered
				countNumHolidays = numHolidays - countDays;
				// are assigned to vacation days
				this.numHolidays = countNumHolidays;
			} else {
				// Error message
				System.out.println("You can discount more days than you have");
			}

	}

}
