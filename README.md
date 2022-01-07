# String Operations

## Part 1

Please switch to the tab above labeled `Shell` and type the following:

```sh
jshell
```

Then hit enter.

You should see the following after replit is done loading:

```sh
|  Welcome to JShell -- Version 11.0.11
|  For an introduction type: /help intro

jshell>
```

This lets us type Java commands into the console, and immediately see what they do. For example, if you type `System.out.println("Hello")` into jshell it will say this:

```sh
|  Welcome to JShell -- Version 11.0.11
|  For an introduction type: /help intro

jshell> System.out.println("Hello")
Hello

jshell>
```

## Part 2

You are going to try a few different things throughout the lesson today to figure what `String` operations in Java do.

### Concatenation

```bash
jshell> String firstName = "Fred";
firstName ==> "Fred"
jshell> String lastName = "Smith";
lastName ==> "Smith"
jshell> String fullName = firstName + " " + lastName;
fullName ==> ?????????
```

Think about the following:

- What is `fullName` equal to now?
- What does concatenation do?

### `length()`

```bash
jshell> int lengthOfName = fullName.length();
lengthOfName ==> ???????
```

Think about the following:

- What is `lengthOfName` equal to now?
- What does `length()` do?

### `substring(int)`

```bash
jshell> fullName.substring(2);
$1 ==> ???????
```

Think about the following:

- What is `$1` equal to now?
- What does `subtring(int)` do?

### `substring(int, int)`

```bash
jshell> fullName.substring(2,4);
$2 ==> ???????
```

Think about the following:

- What is `$2` equal to now?
- What does `substring(int, int)` do?

### `toLowerCase()`

```bash
jshell> fullName.toLowerCase();
$3 ==> ???????
```

Think about the following:

- What is `$3` equal to now?
- What does `toLowerCase()` do?
- Did the value of `fullName` change?

### `toUpperCase()`

```bash
jshell> fullName.toUpperCase();
$4 ==> ???????
```

Think about the following:

- What is `$4` equal to now?
- What does `toUpperCase()` do?
- Did the value of `fullName` change?

### Escape Characters

How do you think you would write a program to print the following:

```
John said, "I don't know"
```

You may have issues printing characters like `"`

The solution is using escape characters. Escape characters are typed by using a `\` character before another character. to print the previous message you would need to write the following:

```java
System.out.println("John said, \"I don\'t know\"");
```

Try typing the following into jshell, and figuring out what each escape character does.

```sh
jshell> System.out.println("Hello\nWorld");
jshell> System.out.println("Hello\tWorld");
jshell> System.out.println("Hello\\World");
```

## Part 3

Imagine someone just learning `String` operations has started writing some Java code to test things out, they were struggling and very confused by their codes ouput. Please help them out by debugging their code and figuring out why their code is not working as expected.

Remember to read directions carefully, if a problem asks you to solve a problem by modifying a certain line then **ONLY MODIFY THAT LINE**.

For part three, our new student was trying to use substring to print the following:

```
Hello
World
```

Figure out what is wrong with lines 7 and 8, and fix the problem. Only modify lines 7 and 8.

NOTE:

Don't push your luck, you should use the new material to solve these problems and **I will not give credit** for answers similar to this:

```
System.out.println("Hello");
System.out.println("World");
```

This goes for all problems.

## Part 4

Our new student was trying to combine the `firstName`, `middleName`, and `lastName` variables to make a new fullName variable. However they expected the following to print out:

```
Fred Edward Smith
```

Fix the issue by modifying line 17.

## Part 5

After helping our new student out, they are confused why the value of `numLetters` changed. they wanted to know the amount of letters in Fred's full name, but wasn't expecting it to increase by two after you helped him out. 

How can you change line 24 to count only the number of letters in Fred's name.

## Part 6

Out new student tried displaying a table of data, however it isn't displaying it how they wanted. They want it to display neat columns of data instead of the crooked columns displaying now. Similar to the following:

```
id  first   last
1   Rose    Tyler
2   Amy     Pond
3   Clara   Oswald
```

Modify lines 31-34 to solve this problem using escape character(s).

## Part 7

After looking at the table, our new student is still not satisfied. They want to see what it would look like if all the headers are in all caps like this:

```
ID  FIRST   LAST
1   Rose    Tyler
2   Amy     Pond
3   Clara   Oswald
```

Modify line 44 to solve this issue.

## Submission

Please submit the following to google classroom:

1. `Main.java`
    * Hover over `Main.java`.
    * Click the three dots to the right of the file name.
    * Click `Download`.
    * Upload the downloaded file to google classroom.
2. A link to your replit project
