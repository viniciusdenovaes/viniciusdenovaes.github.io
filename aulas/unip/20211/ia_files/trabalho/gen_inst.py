import math
class GenInst:
    def __init__(self, N):
        self.N = N

    def get_matrix(self, numero):
        matrix = []
        for i in range(self.N):
            matrix.append(self.N*[0])
        for i in range(self.N):
            for j in range(self.N):
                matrix[i][j] = numero%2
                numero //= 2
        return matrix

    def inst_to_string(self, numero):
        matrix = self.get_matrix(numero)
        return self.matrix_to_string(matrix)

    def matrix_to_string(self, matrix):
        res = str(self.N) + '\n'
        for linha in matrix:
            for cel in linha:
                res += str(cel) + " "
            res += '\n'
        return res

if __name__=='__main__':
    N = 5
    gen = GenInst(N)
    for i in range(511):
        filename = 'inst_{}_{:04d}.in'.format(N, i)
        with open(filename, 'w') as f:
            f.write(gen.inst_to_string(i))
