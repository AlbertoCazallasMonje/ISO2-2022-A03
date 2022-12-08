# PICT - Pairwise Independent Combinatorial Testing tool

In this short document, the steps taken to use this tool are explained. Since the tool is provided by Microsoft, a Windows machine capable of running `.exe` files, is required.

1. Navigate to the [PICT Github Page](https://github.com/microsoft/pict) and download the latest release `pict.exe` from the right-hand tab. The version used at the time of writing is `3.7.4`.
2. Define the testing values within a text file. Each row needs to define the value name, followed by `:`, followed by a comma-seperated list of possible variable values.<br>The text file for this problem is defined as follows: 
```
angle_1: -20, 0, 1, 45, 50, 60, 70, 90, 178, 179, 180, 200
angle_2: -20, 0, 1, 45, 50, 60, 70, 90, 178, 179, 180, 200
angle_3: -20, 0, 1, 45, 50, 60, 70, 90, 178, 179, 180, 200
side_1: -50, 0, 1, 40, 20000
side_2: -50, 0, 1, 40, 20000
side_3: -50, 0, 1, 40, 20000
``` 
3. Open the command prompt or powershell and navigate to the directory, in which both `pict.exe` and the text file are located.
4. Run:
```
C:\Users\user\Desktop\pict.exe C:\Users\user\Desktop\testing_values.txt
```