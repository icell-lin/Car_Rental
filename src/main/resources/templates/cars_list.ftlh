<!DOCTYPE html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <style>
        table { width: 80%; border-collapse: collapse; margin: 20px 0; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
<h1>${title}</h1>

<table>
    <thead>
    <tr>
        <th>Бренд</th>
        <th>Модель</th>
        <th>Ціна за добу (грн)</th>
    </tr>
    </thead>
    <tbody>
    <#list cars as car>
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.pricePerDay}</td>
        </tr>
    <#else>
        <tr>
            <td colspan="3">Автомобілі відсутні в базі даних</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>