# Text Wrap

import textwrap

def wrap(string, max_width):
    str = textwrap.fill(string, max_width)
    return str

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
