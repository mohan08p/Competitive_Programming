def swap_case(s):
    str = ""
    for i in s:
        if i.isupper() == True:
            str+=(i.lower())
        else:
            str+=(i.upper())
            
    return str

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
