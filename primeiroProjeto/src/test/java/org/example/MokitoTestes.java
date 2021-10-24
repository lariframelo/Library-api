package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MokitoTestes {

    @Mock
    List<String> list;

    @Test
    public void primeiroTesteMockito() {
        List<String> list = Mockito.mock(ArrayList.class);

        //estou estabelecendo um tamanho para esse array
        Mockito.when(list.size()).thenReturn(20);

        int size = list.size();

        Assertions.assertThat(size).isEqualTo(20);

        Mockito.verify(list).size(); // verificar se foi chamado determinado método
    }
}
