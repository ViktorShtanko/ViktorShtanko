package EnumMEnu;

public enum Month {

	JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER), MARCH(31,
			Season.SPRING), APRIL(30, Season.SPRING), MAY(31, Season.SPRING), JUNE(
			30, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31,
			Season.SUMMER), SEPTEMBER(30, Season.AUTUMN), OCTOBER(31,
			Season.AUTUMN), NOVEMBER(30, Season.AUTUMN), DECEMBER(31,
			Season.WINTER);
	private int days;
	private Season s;

	private Month(int days, Season s) {
		this.days = days;
		this.s = s;
	}

	public int getDays() {
		return days;
	}

	public Season getS() {
		return s;
	}

}
