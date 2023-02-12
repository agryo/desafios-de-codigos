#!/bin/bash

echo "Atualizando o servidor Linux..."
apt-get update
apt-get upgrade -y
apt-get install apache2 -y
apt-get install unzip -y

echo "Baixando e copiando arquivos da aplicação..."

cd /tmp
wget https://github.com/agryo/linux-projeto2-iac.git
unzip main.zip
cd agryo-main
cp -R * /var/www/html/