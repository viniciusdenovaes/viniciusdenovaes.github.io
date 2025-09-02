# Banco de Dados

Nesta aula vamos aprender a acessar o banco de dados `MySql` através de um programa escrito em `C#`.

Primeiro precisamos ter uma **tabela** e um **banco de dados** para trabalhar.

Para isto vamos usar o xampp no windows

## Como Instalar o XAMPP

O Xampp é um framework que possibilitará ter o MySql e um agente de acesso ao banco de dados.

Faça o download em https://www.apachefriends.org/index.html

Instale o xampp no seu computador, de preferência no diretório




```xml
    <Grid>

        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="Auto"/>
            <ColumnDefinition Width="*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="15"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="5"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="*"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <Label Content="Buscar"
            Grid.Row="1" Grid.Column="2"
               HorizontalAlignment="Center"
               />

        <TextBox Name="BuscarField"
            Grid.Row="3" Grid.Column="2"
               />

        <Button Content="Buscar"
            Grid.Row="5" Grid.Column="2"
                Click="OnBuscarClicked"
               />

        <Button Content="Buscar Todos"
            Grid.Row="7" Grid.Column="2"
                Click="OnBuscarTodosClicked"
               />


        <Label Content="Adicionar"
            Grid.Row="9" Grid.Column="2"
               HorizontalAlignment="Center"
               />

        <Label Content="Nome: "
            Grid.Row="11" Grid.Column="1"
               HorizontalAlignment="Right"
               />
        <TextBox Name="AdicionarNomeField"
            Grid.Row="11" Grid.Column="2"
               />

        <Label Content="Idade: "
            Grid.Row="13" Grid.Column="1"
               HorizontalAlignment="Right"
               />
        <TextBox Name="AdicionarIdadeField"
            Grid.Row="13" Grid.Column="2"
               />

        <Button Content="Adicionar"
            Grid.Row="15" Grid.Column="2"
                Click="OnAdicionarClicked"
               />



    </Grid>
```


```cs
namespace WpfAppTesteMySql01 {
    internal class Animal {
        public string Name { get; set; }
        public int Idade { get; set; }

        public override string ToString() {
            return Name + ", idade: " + Idade;
        }
    }
}
```


```cs
using System;
using System.Collections.Generic;
using System.Windows;
using System.Windows.Controls;

using MySql.Data.MySqlClient;

namespace WpfAppTesteMySql01 {
    public partial class MainWindow : Window {

        ListBox lista;

        public MainWindow() {
            InitializeComponent();
        }

        private void OnBuscarClicked(object sender, RoutedEventArgs e) {
            foreach (var a in searchAnimais(BuscarField.Text)) {
                MessageBox.Show(a.ToString());
            }
        }
        private void OnBuscarTodosClicked(object sender, RoutedEventArgs e) {
            foreach (var a in searchAllAnimais()) {
                MessageBox.Show(a.ToString());
            }
        }

        private void OnAdicionarClicked(object sender, RoutedEventArgs e) {
            String nome = AdicionarNomeField.Text;
            int idade = int.Parse(AdicionarIdadeField.Text);
            
            adicionarAnimal(nome, idade);
            
            AdicionarNomeField.Text = "";
            AdicionarIdadeField.Text = "";
        }

        private List<Animal> searchAnimais(String key) {
            List<Animal> animais = new List<Animal>();

            try {
                String connStr = "Server=localhost;Uid=root;Pwd=;database=veterinario_unip";
                using (MySqlConnection conn = new MySqlConnection(connStr)) { 
                    conn.Open();
                    using (MySqlCommand cmd = conn.CreateCommand()) { 
                        cmd.CommandText = "SELECT * FROM Animais WHERE LOWER(Nome) LIKE LOWER(@KEY)";
                        cmd.Parameters.AddWithValue("KEY","%"+key+"%");
                        using (MySqlDataReader reader = cmd.ExecuteReader()) {
                            while (reader.Read()) {
                                String name = reader.GetString(reader.GetOrdinal("Nome"));
                                int idade = reader.GetInt32(reader.GetOrdinal("Idade"));
                                Animal a = new Animal { Name = name, Idade = idade };
                                animais.Add(a);
                            }
                        }
                    }
                }
            }
            catch (Exception ex){
                MessageBox.Show(ex.ToString());
            }


            return animais;
        }

        private List<Animal> searchAllAnimais() {
            List<Animal> animais = new List<Animal>();

            try {
                String connStr = "Server=localhost;Uid=root;Pwd=;database=veterinario_unip";
                using (MySqlConnection conn = new MySqlConnection(connStr)) {
                    conn.Open();
                    using (MySqlCommand cmd = conn.CreateCommand()) {
                        cmd.CommandText = "SELECT * FROM Animais";
                        //cmd.Parameters.AddWithValue("key", key);
                        using (MySqlDataReader reader = cmd.ExecuteReader()) {
                            while (reader.Read()) {
                                String name = reader.GetString(reader.GetOrdinal("Nome"));
                                int idade = reader.GetInt32(reader.GetOrdinal("Idade"));
                                Animal a = new Animal { Name = name, Idade = idade };
                                animais.Add(a);
                            }
                        }
                    }
                }
            }
            catch (Exception ex) {
                MessageBox.Show(ex.ToString());
            }


            return animais;
        }
        private bool adicionarAnimal(String nome, int idade) {
            int numberOfRowAffected = 0;
            try {
                String connStr = "Server=localhost;Uid=root;Pwd=;database=veterinario_unip";
                using (MySqlConnection conn = new MySqlConnection(connStr)) {
                    conn.Open();
                    using (MySqlCommand cmd = conn.CreateCommand()) {
                        cmd.CommandText = "INSERT INTO Animais(nome, idade) VALUES(@NOME, @IDADE)";
                        cmd.Parameters.AddWithValue("@nome", nome);
                        cmd.Parameters.AddWithValue("@idade", idade);
                        numberOfRowAffected = cmd.ExecuteNonQuery();
                    }
                }
            }
            catch (Exception ex) {
                MessageBox.Show(ex.ToString());
            }
            return numberOfRowAffected>0;
        }

    }
}
```
