package br.com.duda.minhastarefas.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.colorResource
import br.com.duda.minhastarefas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    texto: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String
) {
    OutlinedTextField(
        value = texto,
        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(text = label)
        },
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.light_blue), // Cor da borda focada
            unfocusedBorderColor = colorResource(id = R.color.gray),     // Cor da borda desfocada
            focusedLabelColor = colorResource(id = R.color.light_blue), // Cor do rótulo focado
            focusedTextColor = Color.Black, // Cor do texto quando focado
            unfocusedTextColor = Color.Black // Cor do texto quando desfocado
        )
    )
}

@Composable
@Preview
private fun CaixaDeTextoPreview() {
    val texto = remember { mutableStateOf("EDUARDA") }
    CaixaDeTexto(
        texto = texto.value,
        onValueChange = { texto.value = it },
        modifier = Modifier.fillMaxWidth(),
        label = "Descrição"
    )
}
