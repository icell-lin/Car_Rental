<template>
  <div class="mt-4">
    <h2>Наш автопарк</h2>
    <hr>

    <div class="card mb-4">
      <div class="card-header bg-light">Додати нову машину в базу</div>
      <div class="card-body">
        <form @submit.prevent="addCar" class="row g-3">
          <div class="col-md-4">
            <input v-model="newCar.brand" type="text" class="form-control" placeholder="Бренд (напр. Audi)" required>
          </div>
          <div class="col-md-4">
            <input v-model="newCar.model" type="text" class="form-control" placeholder="Модель (напр. A6)" required>
          </div>
          <div class="col-md-3">
            <input v-model="newCar.pricePerDay" type="number" class="form-control" placeholder="Ціна за добу" required>
          </div>
          <div class="col-md-1">
            <button type="submit" class="btn btn-success w-100">+</button>
          </div>
        </form>
      </div>
    </div>

    <div v-if="cars.length === 0" class="alert alert-info">
      Тягнемо дані
    </div>

    <table v-else class="table table-striped mt-3">
      <thead class="table-dark">
      <tr>
        <th>Бренд</th>
        <th>Модель</th>
        <th>Ціна за добу</th>
        <th>Дії</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="c in cars" :key="c.id">
        <td>{{ c.brand }}</td>
        <td>{{ c.model }}</td>
        <td>{{ c.pricePerDay }} грн</td>
        <td>
          <button @click="removeCar(c.id)" class="btn btn-danger btn-sm">Видалити</button>
        </td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const cars = ref([])

const newCar = ref({
  brand: '',
  model: '',
  pricePerDay: ''
})

// Виніс запит в окрему функцію, щоб її можна було викликати після додавання чи видаленя
const fetchCars = async () => {
  try {
    const res = await axios.get('http://localhost:8080/api/cars')
    cars.value = res.data
  } catch (err) {
    console.error('Помилка завантаження:', err)
  }
}

onMounted(() => {
  fetchCars()
})

// ДОДАВАННЯ
const addCar = async () => {
  try {
    console.log("Кидаємо на сервер:", newCar.value)
    await axios.post('http://localhost:8080/api/cars', newCar.value)
    newCar.value = { brand: '', model: '', pricePerDay: '' }
    fetchCars()
  } catch (err) {
    console.error('Не вийшло зберегти авто:', err)
  }
}

//  ВИДАЛЕННЯ
const removeCar = async (id) => {

  if (!confirm("Точно видаляємо?")) return;
  try {
    console.log("Видаляємо авто з id:", id)
    await axios.delete(`http://localhost:8080/api/cars/${id}`)
    fetchCars()
  } catch (err) {
    console.error('Не вийшло видалити:', err)
  }
}
</script>