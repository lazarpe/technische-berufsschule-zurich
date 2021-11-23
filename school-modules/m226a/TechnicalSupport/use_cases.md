# Technical Support
### What can the user do with the app?

The user is able to type in his problem and describe it in a sentence. The application is going to split all 
words from the sentence and will compare it with known problems that are listed in the hashmap.

When the SupportSystem is able to find matching problems, it will print out the value of the hashmap, which is the
solution of the users problem.

### Use cases
**User**: My computer is running slow <br />
**Support** System: I think it has to do with your hardware.

**SupportSystem**: Any other problems? Y/N  <br />
**User**: yes  <em>(application accepts multiple ways of typing yes: e.g Y, yes, Yes ...)</em> <br />

**SupportSystem**: Describe your problem <br />
**User**: I have a bug <br />
**SupportSystem**: Nobody is perfect. There are bugs in every program. Just try something different!

**SupportSystem**: Any other problems? Y/N  <br />
**User**: no

<strong><em>Programm ended</em></strong>.

### What happens if the user types in multiple key words from the hashmap?
<ins>If the user enters something like this: <br /></ins>
<em>"My friend got a bad **grade** in his last exam, because he was working too **slow** and has a **bug** in his app."</em>

<ins>The response will be about the last word the user entered:</ins><br />
<em>"Nobody is perfect. There are bugs in every program. Taking a break can help!"</em>