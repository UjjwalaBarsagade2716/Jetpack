@file:OptIn(ExperimentalMaterialApi::class)

package com.example.myfirstcomposedemo.ui.Screens.List

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposedemo.Util.RequestState
import com.example.myfirstcomposedemo.data.models.Priority
import com.example.myfirstcomposedemo.data.models.ToDoTask
import com.example.myfirstcomposedemo.ui.theme.taskItemBackgroundColor
import com.example.myfirstcomposedemo.ui.theme.taskItemTextColor

@ExperimentalMaterialApi
@Composable
fun ListContent(
    task: RequestState<List<ToDoTask>>,
    navigateToTaskScreen: (taskId: Int) -> Unit

) {
    if (task is RequestState.Success) {
        if (task.data.isEmpty()) EmptyContent() else DisplayTask(task = task.data, navigateToTaskScreen = navigateToTaskScreen)
    }
}

@Composable
fun DisplayTask(
    task: List<ToDoTask>,
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    LazyColumn {
        items(items = task,
            key = { task ->
                task.id
            }) { task ->
            TaskItem(toDoTask = task, navigateToTaskScreen = navigateToTaskScreen)
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun TaskItem(
    toDoTask: ToDoTask,
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.taskItemBackgroundColor,
        shape = RectangleShape,
        elevation = 2.dp,
        onClick = {
            navigateToTaskScreen(toDoTask.id)
        }
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        ) {
            Row {
                Text(
                    modifier = Modifier.weight(8f),
                    text = toDoTask.title,
                    color = MaterialTheme.colors.taskItemTextColor,
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1

                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.TopEnd
                ) {
                    Canvas(
                        modifier = Modifier
                            .width(12.dp)
                            .height(12.dp)


                    ) {
                        drawCircle(
                            color = toDoTask.priority.color
                        )
                    }
                }

            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = toDoTask.description,
                color = MaterialTheme.colors.taskItemTextColor,
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
@Preview
fun taskItemPreview() {
    TaskItem(toDoTask = ToDoTask(
        0, "Ujjwala", "AAAAAAAAAAAAAAAAAAAAAAAaa" +
                "", Priority.MEDIUM
    ), navigateToTaskScreen = {})
}