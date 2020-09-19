board = [[0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],
         [0,0,0,0,0,0,0,0],]

def checkifsafe(board, row, column):
    #check if there is a queen above
    for i in range(row): 
        if board[i][column] == 1: 
            return False
  
    #check if there is a queen in upper-left diagonal
    for i,j in zip(range(row, -1, -1), range(column,-1,-1)):
        if board[i][j] == 1: 
            return False
  
    #check if there is a queen in upper-right diagonal
    for i,j in zip(range(row, -1, -1), range(column, 8, 1)): 
        if board[i][j] == 1: 
            return False
    return True
    

def placequeen(board, row):
    #if all queens are safely placed return true
    if row >= 8:
        return True
    #iterate through each column in the row
    for i in range (8):
        #check if you can place queen
        safe = checkifsafe(board, row, i)
        if safe == True:
            #place queen
            board[row][i] = 1
            #recursive call place queen in next row
            nextrow = placequeen(board,row+1)
            if nextrow == True:
                return True
            #backtrack
            board[row][i] = 0
    return False

def printboard(board):
    for i in range (8):
        for j in range (8):
            print(board[i][j], end=" ")
        print()

#run algorithm and print solution
placequeen(board,0)
printboard(board)
