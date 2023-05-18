print("Olá, mundo!")
def main():
    text = 'this is a text'
    text2 = "double quotes"
    integer_val = 30
    decimal_val = 30.5
    array = list()
    array2 = []
    dictionary = dict()
    dictionary2 = {}

    print(type(array), '3224', 2)
    print(type(dictionary))

    x2 = calcula_raiz_quadrada(2)
    print(x2)
    log = logger_buiilder('')
    log('teste')
    loggerClass = Logger('teste')
    loggerClass.log('123')
def calcula_raiz_quadrada(nro):
    return nro ** nro
def logger_buiilder(prefix):
    return lambda txt: print(txt)

class Logger():
    def __init__(self, prefix):
        self.prefix = prefix
    
    def log(self, txt):
        print(f'{self.prefix}{txt}')
main()