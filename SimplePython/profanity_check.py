import urllib
def read_text():
    quotes=open("C:/Users/rashmi/Desktop/jesusUdacityAndroid/Python/quotes.txt")
    contents_file=quotes.read()
    print(contents_file)
    quotes.close()
    check_profanity(contents_file)
    
def check_profanity(text):
    connectionObj=urllib.urlopen("http://www.wdylike.appspot.com/?q="+text)
    output=connectionObj.read()
    print(output)
    if "true" in output:
        print("ALert")
    elif "false" in output:
        print("no curse words found")
    else:
        print("n/a")
    connectionObj.close()
    
read_text()
