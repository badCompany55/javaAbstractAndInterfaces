package trans;

public class Auto extends AbstractVehicle
{
	private String model;
	private int year;

	public Auto(int fuel, String model, int year)
	{
		super(fuel);
		this.model = model;
		this.year = year;
	}

	@Override
	public String getPath()
	{
		return "Road";
	}

	@Override
	public String getName()
	{
		return model;
	}

	public void setName(String model)
	{
		this.model = model;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	@Override
	public String toString()
	{
		return "Model: " + model + "\n" +
			"Year: " + year + "\n" +
			"Fuel: " + fuel + "\n";
	}
}
