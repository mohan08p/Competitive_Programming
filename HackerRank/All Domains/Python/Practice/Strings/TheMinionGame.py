# The Minion Game

def minion_game(string):
    # your code goes here
    k = 0
    s = 0
    vowels = "aeiouAEIOU"
    for i in range(len(string)):
        if string[i] in vowels:
            k = k+len(string)-i
        else:
            s = s+len(string)-i
            
    if k > s:
        print("Kevin", k)
    elif k == s:
        print("Draw")
    else:
        print("Stuart", s)

if __name__ == '__main__':
    s = input()
    minion_game(s)
