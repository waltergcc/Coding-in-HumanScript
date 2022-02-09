using static System.Console;

public class Program
{
    static void Demo1()
    {
        int a = 2;
        a = Adicionar20(a);
        WriteLine($"O valor da variável a é {a}");
    }
    static int Adicionar20(int a)
    {
        return a + 20;
    }

    static void TrocarNome(Pessoa p1, string nomeNovo)
    {
        p1.Nome = nomeNovo;
    }
    public static void main()
    {
        Pessoa p1 = new Pessoa();
        p1.Nome = "Walter";
        p1.Idade = 29;
        p1.Documento = "9875";

        TrocarNome(p1, "José");

        WriteLine($"O novo nome é: {p1.Nome}");
    }
}