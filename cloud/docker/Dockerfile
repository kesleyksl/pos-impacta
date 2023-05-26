FROM nginx

LABEL "Faculdade" "Impacta"
LABEL "Teste" "123"
LABEL "mantainer" "Kesley <kesley@teste.com>"

# RUN apk update
# RUN mkdir /aula

COPY ./index.html /usr/share/nginx/html/index.html

# WORKDIR /aula
# COPY index.html .


##subindo node
# FROM node

# RUN mkdir /aula

# WORKDIR /aula
# COPY index.js .
# ##rodar comando após o comando de build ser feito
# CMD ["node", "/aula/index.js"]

# #ENTREPOINT ["node", /aula/index.js]  //funciona igual o cmd