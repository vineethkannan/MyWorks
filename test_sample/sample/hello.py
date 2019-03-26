'''
Created on Jan 15, 2019

@author: USER NEW
'''
def login(* usernamepassword):
    username = usernamepassword[0]
    password = usernamepassword[1]

    if(username=='hello') and (password == 'ello'):
        print("Login Success!")
    else:
        print("Login Failed!")

if __name__ == '__main__':
    login('hello', 'hello')