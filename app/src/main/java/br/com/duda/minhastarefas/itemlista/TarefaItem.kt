@file:Suppress("UNREACHABLE_CODE")

package br.com.duda.minhastarefas.itemlista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import br.com.duda.minhastarefas.R

@Composable
fun TarefaItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.White)
            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp)),
        shape = RoundedCornerShape(16.dp),
    ) {
        ConstraintLayout(
            modifier = Modifier.padding(20.dp)
        ) {
            val (txtTitulo, txtDescricao, cardPrioridade, txtPrioridade, btnDeletar) = createRefs()

            Text(
                text = "Tarefa 1",
                modifier = Modifier.constrainAs(txtTitulo) {
                    top.linkTo(
                        parent.top,
                        margin = 10.dp
                    )
                    start.linkTo(
                        parent.start,
                        margin = 10.dp
                    )
                }
            )
            Text(
                text = "çdjdoifgnvoxifcgnvoifdughbod",
                modifier = Modifier.constrainAs(txtDescricao) {
                    top.linkTo(
                        txtTitulo.bottom,
                        margin = 10.dp
                    )
                    start.linkTo(
                        parent.start,
                        margin = 10.dp
                    )
                }
            )
            Text(
                text = "Prioridade Baixa",
                modifier = Modifier.constrainAs(txtPrioridade) {
                    top.linkTo(
                        txtDescricao.bottom,
                        margin = 10.dp
                    )
                    start.linkTo(
                        parent.start,
                        margin = 10.dp
                    )
                    bottom.linkTo(
                        parent.bottom,
                        margin = 10.dp
                    )
                }
            )
            Card(
                modifier = Modifier
                    .background(Color(0xFF00FF11))
                    .size(30.dp)
                    .constrainAs(cardPrioridade) {
                        top.linkTo(
                            txtDescricao.bottom,
                            margin = 10.dp
                        )
                        start.linkTo(
                            txtPrioridade.end,
                            margin = 10.dp
                        )
                        bottom.linkTo(
                            parent.bottom,
                            margin = 10.dp
                        )
                    },
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(
                        0xFF00FF11
                    )
                )
            ){

            }

            IconButton(
                onClick = {
                },
                modifier = Modifier.constrainAs(btnDeletar){
                    top.linkTo(txtDescricao.bottom, margin = 10.dp)
                    start.linkTo(cardPrioridade.end, margin = 30.dp)
                    end.linkTo(parent.end, margin = 20.dp)
                    bottom.linkTo(parent.bottom, margin = 10.dp)
                }
            ) {
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_delete), contentDescription = null)
            }
        }
    }
}

@Composable
@Preview
private fun TarefaItemPreviw() {
    TarefaItem();
}