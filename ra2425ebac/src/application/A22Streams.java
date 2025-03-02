package application;

import entities.Pessoa;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A22Streams {
    public static void main(String[] args) {
        //Stream<String> stream = List.of("Rodrigo", "Pires", "Teste").stream();

        //filter();

        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        // .forEach()
        pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));
        pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));
 /*
        // .count()
        long cont = pessoas.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();
        System.out.println(cont);

        // .allMatch()
        boolean result = pessoas.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);
        // alternativa ao convencional, que descobre se alguém não é mexicano e para o programa
        //Boolean resultF = true;
        //for (Pessoa p : pessoas) {
        //    if (!p.getNacionalidade().equals("Mexico")) {
        //        resultF = false;
        //        break;
        //    }
        //}

        // .collect()
        //List<Pessoa> pessoasComM = pessoas.stream()
          //      .filter(pessoa -> pessoa.getNome().startsWith("M"))
            //    .collect(Collectors.toList());
        //pessoasComM.forEach(pessoa -> System.out.println(pessoa)); mesma coisa que...
        //pessoasComM.forEach(System.out::println);

        pessoas.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .toList()
                // .toList() é desnecessário, pois o método final .forEach() vai imprimir a stream()
                .forEach(System.out::println);

        System.out.println("-------X-------X-------");

        ArrayList<Pessoa> arrayList = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);

        System.out.println("-------X-------X-------");

        Map<Integer, Pessoa> mapList = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Canada"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        mapList.forEach((k,v) -> System.out.println(v));

        System.out.println("-------X-------X-------");

        Map<Integer, List<Pessoa>> mapGrupoIdade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        mapGrupoIdade.forEach((k,v) -> System.out.println(v));

        System.out.println("-------X-------X-------");

        Map<String, Integer> mapGrupoNacESomaIdade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade,
                        Collectors.summingInt(Pessoa::getIdade)));
        mapGrupoNacESomaIdade.forEach((k,v) -> System.out.println(v));

        // Optional .max() e .min()
        Optional<Pessoa> opcional = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
        //opcional.ifPresent(System.out::println); mesma coisa que...
        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }
        */
    }

    private static void filter(){
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        IntStream str1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
        // DoubleStream , LongStream , IntStream = com estes usar o .mapTo
        // .sorted() = utilizado para ordenar elementos conforme alguma lógica entre parênteses
        List<Pessoa> listStr2 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome))
                .toList();
        System.out.println(Arrays.toString(listStr2.toArray()));

        Stream<Pessoa> str3 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
        System.out.println(str3);

        // .distinct() = retorna elementos exclusivos, que não se repetem
        // precisa implementar equals e hascode na classe Pessoa
        // se repetir, permanece a ultima ocorrência
        Stream<Pessoa> str4 = pessoas.stream()
                .distinct();
        // .limit() = limitar o número de elementos filtrados, escolhidos, etc.
        Stream<Pessoa> str5 = pessoas.stream()
                .limit(2);



        Stream stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        Predicate<Pessoa> predi = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream stream1 = pessoas.stream().filter(predi);

        Predicate<Pessoa> predi1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };
        Stream stream2 = pessoas.stream().filter(predi);
    }

}
