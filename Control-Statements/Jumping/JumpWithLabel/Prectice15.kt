//Q15th
/*
    Write a Kotlin program to simulate a file processing system using labeled loops.

    Problem Description:
    There are 3 folders (Folder 1 to 3)
    Each folder contains 5 files (File 1 to 5) 
*/

fun main()
{
    outer@ for(folder in 1..3)
    {
        for(file in 1..5)
        {
            print("Folder $folder - File $file (open/skip/stop/corrupt): ")
            var input = readln().trim().lowercase()

            if(folder == 3 && file == 2)
            {
                println("Critical Error - System Stopped")
                break@outer
            }
            
            if(input == "stop") break@outer
            if(input == "skip") continue@outer

            if(input == "corrupt")
            {
                println("File Corrupted")
                continue
            }

            if(input == "open") println("File $file in Folder $folder Processed")
            else
            {
                println("Invalid Command")
                continue
            }
        }
    }
}