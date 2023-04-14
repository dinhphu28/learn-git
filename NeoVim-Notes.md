### Motion in NVim:

  w: go to the first charactor of next word
  e: go to the last charactor of next word
  $: go to end of line
  0: go to begin of line

### The undo command
  
  u: to undo previous actions
  U: to undo all the changes on the line
  ^r (Ctrl + r): redo

### The put command

  p: to put previously deleted text after the cursor
  P: to put previously deleted text before the cursor

### Replace

  r: to replace the character at the cursor (with the character you type after r command)

### The change operator

  c: use to change text with the same motions as deleted (d command)

### Cursor location an file status

  ^g (Ctrl + g): to show your location in a file and file status
  G: to move to a line in a file (Ex: 100G to go to line 100; Or only G to go to the end of the file)
  gg: to move to the start of the file

### The search command

  / + <word to search>: to search forward direction
  ? + <word to search>: to search backward direction

  After press Enter to confirm, press:

  n: to next
  N: to previous

To go back to where you came from press ^o (Ctrl + 0)
Press ^i (Ctrl + i) to go forward
To show jump list, type :ju

Note: to turn off highlighting until the next search, type :noh

### Matching parentheses search

Type % to find a matching ), ], or }.

Place the cursor on any (, [, or { then press %

### The substitute command

Type :s/old/new to substitue "new" for "old"

Note that :s command only change the first match of the "old" in the line

  - Adding the g flag (global) to change entire match in line :s/old/new/g

  - Adding c flag to find every occurrence and show propmt whether to substitute or not :s/old/new/gc

To change every occurrence in whole file :%s/old/new/g

### Execute an external command

Type :! followed by an external command to execute this (shell) command

Example: :!ls to list all files of your directory

### More on writing files

To save current file with <file-name>, type :w <filename>

### Selecting text to write

Press v then move the cursor to choose the text you want. Then type :w <file-name> to save

Make sure you see :'<,'>w <file-name>

> Note: Pressing v starts visual selection, you can use operator to do something with the selected text. For instance, use d to delete, etc...

### Retrieving and merging files

To retrieve the contents of a file, type :r <file-name>
It will insert content of this file below the cursor line.

You can also read the output of an external command. For example,

  :r !ls

### The open command

Type o to open a line below the cursor and place you in Insert mode.

To open a new line above the cursor, type O

### The append command

  a: to append text after the cursor
  A: to append text after the end of line

### Another way to replace

Instead r command to replace only 1 character, type R to replace the text from the cursor (replace mode)

### Copy and paste text

Start Visual mode with v command and select text.

Then press y (yank) to copy selected text and p to put the text after the cursor.

Instead of using Visual mode to select text, you can use y with operator. For example,

  yw: to yank a word

  yy: to yank a line

You can use P instead of p command to put the text before the cursor.

### Set option

Set an option to search and substitute commands ignore case

  - Set the ignore case (ic) option by :set ic

  - Set highlight search and incsearch by :set hls is

  - To disable ignoring case enter :set noic

  - To invert the value of a setting, prepend it with "inv". For example, :set invic

  - To remove the highlighting of matches, enter :nohlsearch

> Note: If you want to ignore case for just one search command, type use \c
in the phrase: /search-word\c

---

### Scroll page

  ^e (Ctrl + e) to scroll up
  ^y (Ctrl + y) to scroll down

### Go to column

To go to column 10 in a line which cursor place on, type 10|

### Case

  Use command ~ to swap case (only if tildeop is set)

  Or use g~ to swap case

  Use gu to make lowercase

  Use gU to make uppercase

### Navigation

Go to first non-blank character of the line with ^

Go to start of previous word with b

  ): go to next sentence
  (: go to previous sentence
  {: go to previous paragraph
  }: go to next paragraph
