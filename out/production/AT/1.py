#Python se destaca na ciência de dados por várias razões:
#Facilidade de Aprendizado: A sintaxe simples e clara do Python torna a linguagem acessível a iniciantes, permitindo que profissionais de diversas áreas, mesmo sem formação em tecnologia, possam utilizá-la rapidamente1.
#Bibliotecas Poderosas: Python possui uma vasta gama de bibliotecas específicas para análise de dados, como Pandas, NumPy, Matplotlib e Seaborn, que facilitam a manipulação e visualização de dados1.
#Versatilidade e Escalabilidade: A linguagem é altamente versátil e pode ser utilizada para resolver diversos tipos de problemas com adaptações mínimas. Isso é crucial em um campo onde as necessidades podem mudar rapidamente

import pandas as pd

data = {
    'Nome': ['Alice', 'Bob', 'Charlie'],
    'Idade': [25, 30, 35],
    'Cidade': ['São Paulo', 'Rio de Janeiro', 'Belo Horizonte']
}

df = pd.DataFrame(data)


print("DataFrame Original:")
print(df)


df['Salário'] = [5000, 6000, 7000]


filtro = df[df['Idade'] > 28]


print("\nDataFrame Modificado:")
print(filtro)