// Package weather provides tools to forecast temperatures.
package weather

// CurrentCondition represents weather condition at specific location.
var CurrentCondition string

// CurrentLocation represents the city given to forecast function.
var CurrentLocation string

// Forecast function.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
