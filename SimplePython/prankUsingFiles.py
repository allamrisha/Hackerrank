
import os, sys

# Open a file
path = "C:/Users/rashmi/Desktop/jesusUdacityAndroid/Python/prank/prank"
newDirs=[]
print(os.getcwd())
os.chdir("C:/Users/rashmi/Desktop/jesusUdacityAndroid/Python/prank/prank")

def rename_files():
    #get file names
    dirs = os.listdir(path);
    for file in dirs:
        #print file
        result=''.join([i for i in file if not i.isdigit()])
        #print result
        os.rename(file,result)
    #newDirs.append(result)
        
rename_files()
