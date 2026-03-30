//Q19th
/*
    Write a Kotlin program to simulate a multi-level system monitoring process using labeled loops.

    Problem Description:
    There are 3 systems (System 1 to 3)
    Each system has 5 processes (Process 1 to 5) 
*/

fun main()
{
    outer@ for(system in 1..3)
    {
        for(process in 1..5)
        {
            print("System $system - Process $process (run/fail/restart/skip/shutdown): ")
            var input = readln().trim().lowercase()
            if(system == 3 && process == 3)
            {
                println("Critical System Failure - Shutdown Initiated")
                break@outer
            }

            if(input == "shutdown") break@outer
            if(input == "restart") continue@outer
            if(input == "fail")
            {
                println("Process Failed")
                continue
            }
            if(input == "skip") continue
            if(input == "run") println("Process $process in System $system Running")
            else println("Invalid Input")
        }
    }
}