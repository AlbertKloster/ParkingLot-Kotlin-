# Stage 2/5: Only 2 spots
## Description
At this stage, our minimalistic parking lot has two parking spots. Let's assume that <b>the first spot is occupied</b> and the second one is free.

The parking lot should allow the user to park the car. This is implemented using the `park` command. After the user has entered this command, the registration number and the color of the car should be specified. For example, `park KA-01-HH-1234 Blue`. The registration number should not contain spaces. The color can be written in either uppercase or lowercase letters.

As the first spot is already taken, the program should allocate the second spot and print: `Blue car parked in spot 2`. The color should match what the user inputs.

To pick up the car, the user should print the command `leave` and then the number of the parking spot, for example, `leave 1`. If there is no car in the given spot, the program should print an error: `There is no car in spot 1`. Otherwise, it should notify the user that the spot is now available: `Spot 1 is free`.

## Examples
The symbol `>` represents the user input. Note that it isn't part of the input.

<b>Example 1:</b>
```
> park KA-01-HH-1234 Blue
Blue car parked in spot 2.
```

<b>Example 2:</b>
```
> leave 1
Spot 1 is free.
```

<b>Example 3:</b>
```
> leave 2
There is no car in spot 2.
```
