package com.github.dreamhead.jfun.optional;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.Test;

import static com.github.dreamhead.jfun.optional.FluentOptional.from;
import static com.github.dreamhead.jfun.optional.Optionals.bind;
import static com.google.common.base.Optional.fromNullable;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OptionalTest {

    private Optional<Person> personOptional;

    @Before
    public void setup() {
        Country country = new Country("China");
        Province province = new Province("Liaoning", country);
        City city = new City("fushun", province);
        Place place = new Place("jiangjun", city);
        Person person = new Person("dreamhead", place);

        personOptional = fromNullable(person);
    }


    @Test
    public void should_work_for_optional() {
        Optional<Country> countryOptional1 = bind(
                bind(
                        bind(
                                bind(personOptional, getPlace()),
                                getCityFromPlace()),
                        getProvinceFromCity()),
                getCountryFromProvince());
        assertThat(countryOptional1.get().getName(), is("China"));
    }

    @Test
    public void should_work_for_fluent_optional() {
        FluentOptional<Country> countryOptional = from(personOptional).bind(getPlace()).bind(getCityFromPlace()).bind(getProvinceFromCity()).bind(getCountryFromProvince());
        assertThat(countryOptional.get().getName(), is("China"));
    }

    private Function<Province, Optional<Country>> getCountryFromProvince() {
        return new Function<Province, Optional<Country>>() {
            @Override
            public Optional<Country> apply(Province input) {
                return fromNullable(input.getCountry());
            }
        };
    }

    private Function<City, Optional<Province>> getProvinceFromCity() {
        return new Function<City, Optional<Province>>() {
            @Override
            public Optional<Province> apply(City input) {
                return fromNullable(input.getProvince());
            }
        };
    }

    private Function<Place, Optional<City>> getCityFromPlace() {
        return new Function<Place, Optional<City>>() {
            @Override
            public Optional<City> apply(Place input) {
                return fromNullable(input.getCity());
            }
        };
    }

    private Function<Person, Optional<Place>> getPlace() {
        return new Function<Person, Optional<Place>>() {
            @Override
            public Optional<Place> apply(Person input) {
                return fromNullable(input.getPlace());
            }
        };
    }
}
