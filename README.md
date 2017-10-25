# ff-scala
A Scala implementation of the Flippy Flop data structure.

## Background

A Flippy Flop is an unpredictable data structure.
Flip (insertion) and flop (removal) operations succeed at random.

## Usage

As you'll see in the example below, the Flippy Flop is sufficiently unpredictable.

### Scala
```
import FlippyFlop

var ff = new FlippyFlop()

// Attempt to insert a value
ff.flip(5)

// Could be 5, or undefined if the flip call failed
var flop1 = ff.flop

// Could be 5 if the flop call didn't remove the value, or undefined if the flip call failed
var flop2 = ff.flop

// However, it's easy to verify the number of elements in a FlippyFlop
var count = ff.length

```

# Contact

You can most easily reach me on twitter [@_Shakeel](http://twitter.com/_Shakeel).

# License

This project is licensed under the terms of [the MIT license](LICENSE).
