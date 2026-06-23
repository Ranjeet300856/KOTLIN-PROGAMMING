/*
    Question 3: Unique Character Collection Manager Using LinkedHashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Character Collection Manager using LinkedHashSet Collection.

    The program should allow users to manage unique characters through a Menu Driven Program.
    Features:

    1. Add a new character.
       - Character must be a single alphabet letter (A-Z or a-z).
       - Duplicate characters should not be added.

    2. Remove an existing character.
       - Display an appropriate message if the character does not exist.

    3. Search a character.
       - Display whether the character exists or not.

    4. Display all characters.
       - Display characters in the same order in which they were added.
       - Display a message if no characters are available.

    5. Display the total number of stored characters.
    6. Exit the program.
*/

fun inputChar(): Char
{
   while(true)
   {
      print("Enter a character : ")
      val input = readln().trim()
      if(input.isBlank() || input.length != 1 || !(input[0] in 'A'..'Z' || input[0] in 'a'..'z'))
      {
         println("Invalid Input! Try Again")
         continue
      }

      return input[0]
   }
}

fun addNewChar(set: LinkedHashSet<Char>) 
{
   val char = inputChar()
   if(!set.add(char)) println("Duplicate character not inserted!")
   else println("Character $char added successfully")
}

fun removeChar(set: LinkedHashSet<Char>) 
{
   if(set.isEmpty())
   {
      println("Characters set is empty")
      return
   }

   val char = inputChar()
   if(set.remove(char)) println("$char remove successfully")
   else println("$char not found")
}

fun searchChar(set: LinkedHashSet<Char>) 
{
   if(set.isEmpty())
   {
      println("Characters set is empty")
      return
   }

   val char = inputChar()
   if(set.contains(char)) println("Character $char Found")
   else println("Character $char Not Found")
}

fun display(set: LinkedHashSet<Char>) 
{
   if(set.isEmpty())
   {
      println("Characters set is empty")
      return
   }

   print("\nUnique Characters : ")
   for(ch in set) print("$ch  ")
   println()
}

fun displaySize(set: LinkedHashSet<Char>) = println("Total Unique Characters : ${set.size}")

fun main()
{
   println("\n===== Unique Character Management System =====\n")
   val characters = LinkedHashSet<Char>()
   while(true)
   {
      println("\n1. Add a new character")
      println("2. Remove a character")
      println("3. Search a character")
      println("4. Display all characters")
      println("5. Display characters set size")
      println("6. Exit this program")

      print("\nEnter your choice : ")
      val choice = readln().trim().toIntOrNull()
      if(choice == null)
      {
         println("Invalid Input! Try Again")
         continue
      }

      when(choice)
      {
         1 -> addNewChar(characters)
         2 -> removeChar(characters)
         3 -> searchChar(characters)
         4 -> display(characters)
         5 -> displaySize(characters)
         6 -> {
            println("Program exits successfully")
            break
         }

         else -> println("Invalid Choice Input!")
      }
   }
}