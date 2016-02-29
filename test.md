## Installation steps:
 https://github.com/eayivi/fullstack-course1-module1/blob/master/MacOS-InstallSteps.md

## Getting to know Ruby

puts stands for Put String

Ruby variables; all lowercase, snake_case, Constants should be ALL_CAPS or FirstCap
 
Classes (and modules): CamelCase
Semicolons are optional, try to not put many statements in one line. 

irb is a ruby command line, IRB (interactive Ruby), REPL (Read Evaluate Print Loop)

In Ruby everything evaluates to something


### true vs false
false and nil objects are false (without quotes)
everything else is true, including zero, empty

### == vs ===

=== a different kinda of equal, it is a superset of equal, used often in regex:

```ruby

#these are always true for instance
if /sera/ === "coursera" # always true
if "coursera" === "coursera"
if Integer === 21
end #don't forget the end

```

### Flow of control
 
####  if, unless, elsif, else - 
