# StudyHelper
A tool used to frequently prompt the user with short questions and the prompts can not be closed until the question is answered correctly.

## How to Use:
### Adding Questions and Answers
Add a .txt file to the "content" folder with each line in the following format:

> Message or Question to Display\image_in_icons_folder.png\possible answer1\possible answer2\more answers

For example, `Transcribe the hieroglyph\vulture.png\A\aleph` will create a prompt telling the user to translate the image shown, vulture.png. "vulture.png" is stored in the "icons" folder and the possible correct answers include "A" or "aleph".

Any text files in "content" will be included in the question bank so there can be multiple .txt files to make organization easier.

### Including Images
Prompts can include one image. These images must be stored in the "icons" folder and will appear on the left side of the prompt.

### Changing the Settings
There are three possible settings:
1. **latency**: an integer representing the time between rounds of questions.
2. **unit**: the unit that the number for **latency** is. 
3. **size**: the number of questions per round.

For example, if latency is 30, units is "minutes" (without quotations), and size is 5, then the user will be prompted with a round of 5 questions every 30 minutes.

### Suggested Use
- Compile the code into an executable jar file and add shortcut link to the executable in the "startup" folder so when the computer first starts up the program will run.
- If you wish to fully close the program once it is running, in the answer textbox type "--stop" (withou quotations).

## Included Example Questions
Since I originally created this program to help learn middle egyptian hieroglyphic, an example question set is included that displays a hieroglyph (i.e., a unilateral sign) and asks the user for the correct transcription. Looking at how these questions and images are organized will hopefully help clear up any remaining confusion on the set-up.
