# Journal
Write your Journal questions and notes here.

# Phase 1

I created the Artifact class with a name and Integer ID. I also added a static counter to keep track of how many artifacts are created. I learned that int is a primitive type, while Integer is a wrapper class that can also hold a null value.

# Phase 2

I added the Universal Cataloging Constant as a static final variable. It is shared by all artifacts and cannot be changed. I learned that static means it belongs to the class instead of one object, while final means the value cannot be changed.

# Phase 3

I created the ArchiveCalculator utility class and added a static method to calculate the Stability Index. I learned that a static utility method is useful when I do not need to create an object just to perform a calculation.

# Phase 4

I created the archive report and formatted the constant to three decimal places. I also used Double.parseDouble() to turn the raw log string into a double. This is useful because real data from files and logs often starts as text.

# Phase 5

I tested the program with energy levels above and below the constant. The calculations worked correctly because Math.abs() handles the difference either way. I did not make any major changes because the program was working as expected.
