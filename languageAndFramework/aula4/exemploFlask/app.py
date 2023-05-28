from flask import Flask

app = Flask(__name__)

@app.route("/hello/")
def hello():
    return "Hello, world!"

app.run(host='localhost', port=8080, debug=True)