var clase = Java.type('java.util.ArrayList');

var  lista = new clase();
lista.add('Primero ');
lista.add('Como  ');
lista.add('Luego ');
lista.add('Existo ');

print(lista.get(0));
for (var i = 0; i < lista.length; i++) {
	print(lista.get(i));
}