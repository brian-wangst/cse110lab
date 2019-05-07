package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float conversion = (float)((this.getValue() - 32) * (5.0/9.0));
        return new Celsius(conversion);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        float str = this.getValue();
        String total = String.valueOf(str);

        return total + " F";
    }
}