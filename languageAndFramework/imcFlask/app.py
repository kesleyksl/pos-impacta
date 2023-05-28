from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/imc/calculate', methods=['POST'])
def calculate_imc():
    data = request.get_json()
    height = float(data['height'])
    weight = float(data['weight'])

    imc = weight / (height ** 2)
    description = get_imc_description(imc)

    result = {
        'height': height,
        'weight': weight,
        'imc': imc,
        'description': description
    }

    return jsonify(result)

def get_imc_description(imc):
    if imc < 18.5:
        return 'Magreza'
    elif imc < 25:
        return 'Normal'
    elif imc < 30:
        return 'Sobrepeso'
    else:
        return 'Obesidade'

if __name__ == '__main__':
    app.run(port=8080)
