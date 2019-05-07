package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float conversion = (float) (this.getValue() * (9.0/5.0) + 32);
        return new Fahrenheit(conversion);
    }

    public String toString()
    {
        float total = this.getValue();
        String strTotal = String.valueOf((total));
        return strTotal + " C";
    }
}