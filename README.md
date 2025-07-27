# Russian Roulette - File Deletion Game

This is a Java experiment of a digital Russian roulette.  
The player must enter numbers from 1 to 6 and try to survive 5 rounds.  
If the player guesses the "bullet" number, their **Desktop** and **Documents** will be permanently deleted.

---

## Warning

> **This program deletes real files.**  
> Running it may cause the loss of important data.  
> **Do not use in real environments.**  
> **Do not run it on your main computer.**

---

## How It Works

- A random number from 1 to 6 is generated as the "bullet".
- The player enters a number each round.
- If they avoid the bullet for 5 rounds → "You Survived!"
- If they guess the bullet → the entire contents of the Desktop and Documents folders are deleted.

---