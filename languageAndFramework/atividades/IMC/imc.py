def CalculateIMC(peso, altura):
    if peso <= 0 or altura <= 0:
        return None

    imc = peso / (altura ** 2)
    return imc


def IMCClassification(imc):
    if imc <= 18.5:
        return "Magreza"
    elif imc < 24.9:
        return "Normal"
    elif imc < 30:
        return "Sobrepeso"
    else:
        return "Obesidade"

def readPositiveNumbericValue(message):
    value = 0
    while True:

        try:    
            value = float(input(message))
            if value > 0:
                break
            showPositiveNumericValueError()                
        except ValueError:
            showPositiveNumericValueError()
    return value

def showPositiveNumericValueError():
    print("O valor digitado não é um valor númérico positivo. Tente novamente!")

def main():
    peso = readPositiveNumbericValue("Digite o seu peso em kg: ")
    altura  = readPositiveNumbericValue("Digite a sua altura em metros: ")    
    imc = CalculateIMC(peso, altura)

    if imc is None:
        print("Erro: Peso e altura devem ser números positivos.")
    else:
        classification = IMCClassification(imc)
        print("Seu IMC é de {:.2f}".format(imc) + "kg/m². Este valor é considerado como " + classification)

main()