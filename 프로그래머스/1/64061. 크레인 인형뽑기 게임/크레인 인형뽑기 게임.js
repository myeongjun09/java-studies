function solution(board, moves) {
    var answer = 0;
    let stack = [];

            for(let pos of moves) {
                // console.log(x)

                for(let i = 0; i<board.length; i++) {
                    // console.log(i, x-1);
                    if(board[i][pos-1]!==0) {
                        let temp = board[i][pos-1];
                        board[i][pos-1] = 0;
                        if(temp=== stack[stack.length-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(temp);
                        }
                        break;
                    }
                }
            } // for pos

            return answer;
}